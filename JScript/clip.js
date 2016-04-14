copy("abc" + "\r\n" + "xyz");

function copy(text){
  var shell = new ActiveXObject("WScript.Shell");
  var clip = shell.Exec("clip");
  var stdIn = clip.StdIn;
  stdIn.WriteLine(text);
  stdIn.Close();
}
