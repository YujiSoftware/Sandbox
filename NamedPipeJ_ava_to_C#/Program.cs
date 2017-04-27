using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.IO.Pipes;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                //Create pipe instance
                using (var pipeServer = new NamedPipeServerStream("testpipe", PipeDirection.InOut, 4))
                {
                    Console.WriteLine("[ECHO DAEMON] NamedPipeServerStream thread created.");

                    //wait for connection
                    Console.WriteLine("[ECHO DAEMON] Wait for a client to connect");
                    pipeServer.WaitForConnection();

                    Console.WriteLine("[ECHO DAEMON] Client connected.");
                    try
                    {
                        // Stream for the request.
                        StreamReader sr = new StreamReader(pipeServer);
                        // Stream for the response.
                        StreamWriter sw = new StreamWriter(pipeServer);
                        sw.AutoFlush = true;

                        // Read request from the stream.
                        string echo = sr.ReadLine();

                        Console.WriteLine("[ECHO DAEMON] Request message: " + echo);

                        // Write response to the stream.
                        sw.WriteLine("[ECHO]: " + echo);

                        pipeServer.Disconnect();
                    }
                    catch (IOException e)
                    {
                        Console.WriteLine("[ECHO DAEMON]ERROR: {0}", e.Message);
                    }
                }
            }
        }
    }
}
