var Cake = React.createClass({
    getInitialState: function() {
        return {
            cake: []
        };
    },

    componentDidMount: function() {
        this.serverRequest = $.get("sample.json", function (result) {
            this.setState({
                cake: [
                    {
                        title: "batter",
                        data: result.batters.batter
                    },
                    {
                        title: "topping",
                        data: result.topping
                    }
                ]
            });
        }.bind(this));
    },

    componentWillUnmount: function() {
        this.serverRequest.abort();
    },

    render: function() {
        var commentNodes = [];
        for(var i = 0; i < this.state.cake.length; i++) {
            var cake = this.state.cake[i];
            
            commentNodes.push(
                <div>
                    <h3>{cake.title}</h3>
                    <BootstrapTable data={cake.data} striped={true} hover={true}>
                        <TableHeaderColumn isKey={true} dataField="id">Product ID</TableHeaderColumn>
                        <TableHeaderColumn dataField="type">Type</TableHeaderColumn>
                    </BootstrapTable>
                </div>
            );
        }
        
        return (
            <div className="commentList">
                {commentNodes}
            </div>
        );
    }
});

ReactDOM.render(
  <Cake />,
  document.getElementById('container')
);