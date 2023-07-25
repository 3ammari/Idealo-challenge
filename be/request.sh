curl "http://0.0.0.0:8080/evaluate" -H'content-type: text/plain' -d"POSITION 1 3 EAST
                                                                    FORWARD 3
                                                                    WAIT
                                                                    TURNAROUND
                                                                    FORWARD 1
                                                                    RIGHT
                                                                    FORWARD 2" && echo
