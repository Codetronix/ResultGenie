package com.rg.utils;

import org.jsoup.Jsoup;

import java.util.Arrays;

/**
 * Created by prathyush on 5/11/16.
 */
public class ParserUtils {

    public static String result = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">\n" +
            "<HTML>\n" +
            "   <HEAD>\n" +
            "      <TITLE>Welcome to VTU</TITLE>\n" +
            "      <META http-equiv=Content-Type content=\"text/html; charset=windows-1252\">\n" +
            "      <LINK href=\"../../image/main.css\" type=text/css rel=stylesheet>\n" +
            "      <SCRIPT language=JavaScript> var currentpage = 'home';\n" +
            "         if(document.images){\n" +
            "             newson = new Image();\n" +
            "             newson.src = \"../image/newson.gif\";\n" +
            "             regionson= new Image();\n" +
            "             regionson.src = \"../image/regionson.gif\";\n" +
            "             regionsoff = new Image();\n" +
            "             regionsoff.src = \"../image/regionsoff.gif\";\n" +
            "             mediakiton = new Image();\n" +
            "             mediakiton.src = \"../image/mediakiton.gif\";\n" +
            "             mediakitoff = new Image();\n" +
            "             mediakitoff.src = \"../image/mediakitoff.gif\";\n" +
            "             abouton = new Image();\n" +
            "             abouton.src = \"../image/abouton.gif\";\n" +
            "             aboutoff = new Image();\n" +
            "             aboutoff.src = \"../image/aboutoff.gif\";\n" +
            "             contactuson = new Image();\n" +
            "             contactuson.src = \"../image/contactuson.gif\";\n" +
            "             contactusoff = new Image();\n" +
            "             contactusoff.src = \"../image/contactusoff.gif\";\n" +
            "             admissionson = new Image();\n" +
            "             admissionson.src = \"../image/admissionson.gif\";\n" +
            "             admissionsoff = new Image();\n" +
            "             admissionsoff.src = \"../image/admissionsoff.gif\";\n" +
            "             courseson = new Image();\n" +
            "             courseson.src = \"../image/courseson.gif\";\n" +
            "             Coursesoff = new Image();\n" +
            "             coursesoff.src = \"../image/coursesoff.gif\";\n" +
            "             examinationson = new Image();\n" +
            "             examinationson.src = \"../image/examinationson.gif\";\n" +
            "             examinationsoff = new Image();\n" +
            "             examinationsoff.src = \"../image/examinationsoff.gif\";\n" +
            "             administrationon = new Image();\n" +
            "             administrationon.src = \"../image/administrationon.gif\";\n" +
            "             administrationoff = new Image();\n" +
            "             administrationoff.src = \"../image/administrationoff.gif\";\n" +
            "         \n" +
            "         \n" +
            "         }\n" +
            "         \n" +
            "         function rollover(name,state){\n" +
            "         \n" +
            "         if(currentpage != name){\n" +
            "                 document[name].src = eval(name + state + '.src');\n" +
            "                 if(currentpage != 'home'){\n" +
            "                     document[currentpage].src = eval(currentpage + 'off.src');\n" +
            "                 }\n" +
            "             }\n" +
            "         }\n" +
            "         \n" +
            "      </SCRIPT>\n" +
            "      <META content=\"Microsoft FrontPage 5.0\" name=GENERATOR>\n" +
            "      <style type=\"text/css\">\n" +
            "         <!--\n" +
            "            .style1 {font-family: Georgia, \"Times New Roman\", Times, serif}\n" +
            "            -->\n" +
            "      </style>\n" +
            "   </HEAD>\n" +
            "   <BODY bottomMargin=0 vLink=#ffffff aLink=#ffffff link=#ffffff bgColor=#809cc9\n" +
            "      leftMargin=0 background=../image/ultranewbg.gif topMargin=0 rightMargin=0\n" +
            "      marginheight=\"0\" marginwidth=\"0\">\n" +
            "      <TABLE cellSpacing=0 cellPadding=0 border=0 height=\"825\">\n" +
            "         <TBODY>\n" +
            "            <TR>\n" +
            "               <TD width=193 height=\"16\"></TD>\n" +
            "               <TD align=left width=428 height=\"16\"></TD>\n" +
            "               <TD height=\"16\"></TD>\n" +
            "            </TR>\n" +
            "            <TR>\n" +
            "               <TD align=left width=193 bgColor=#9CB6D6 height=\"88\">\n" +
            "                  <p align=\"center\">&nbsp;</p>\n" +
            "               </TD>\n" +
            "               <TD colSpan=2 height=\"88\">\n" +
            "                  <TABLE cellSpacing=0 cellPadding=0 width=559 border=0>\n" +
            "                     <TBODY>\n" +
            "                        <TR>\n" +
            "                           <TD colSpan=2 width=\"557\">\n" +
            "                              <IMG alt=\"\" border=0 height=4\n" +
            "                                 src=\"../image/bannertop.gif\" width=560>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD align=left width=84 bgColor=#ffffff>\n" +
            "                              <IMG alt=\"\" border=0 src=\"../image/bannerleft.gif\" width=\"85\" height=\"63\">\n" +
            "                           </TD>\n" +
            "                           <TD vAlign=top align=left bgColor=#ffffff width=\"465\">\n" +
            "                              <!-- START CF_ADCALL OUTPUT -->\n" +
            "                              <a href=\"../vitavi.php\">\n" +
            "                              <IMG border=0 height=60 src=\"../image/n.gif\" width=390>\n" +
            "                              </a>\n" +
            "                              <NOSCRIPT> </NOSCRIPT>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD colSpan=2 width=\"557\">\n" +
            "                              <IMG alt=\"\" border=0 height=22\n" +
            "                                 src=\"../image/bannerbottom.gif\" width=560>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                     </TBODY>\n" +
            "                  </TABLE>\n" +
            "               </TD>\n" +
            "            </TR>\n" +
            "            <!-- first column -->\n" +
            "            <TR>\n" +
            "               <TD vAlign=top width=193 height=\"721\">\n" +
            "                  <TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
            "                     <TBODY>\n" +
            "                        <TR>\n" +
            "                           <TD vAlign=top width=193>\n" +
            "                              <!-- LANGUAGE CHOOSER TABLE -->\n" +
            "                              <TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
            "                                 <TBODY>\n" +
            "                                    <TR>\n" +
            "                                       <TD></TD>\n" +
            "                                       <TD></TD>\n" +
            "                                       <TD></TD>\n" +
            "                                    </TR>\n" +
            "                                 </TBODY>\n" +
            "                              </TABLE>\n" +
            "                           </TD>\n" +
            "                           <!-- END OF LANGUAGE CHOOSER TABLE -->\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD>\n" +
            "                              <TABLE cellSpacing=0 cellPadding=0 width=193 border=0>\n" +
            "                                 <TBODY>\n" +
            "                                    <TR>\n" +
            "                                       <TD width=5>\n" +
            "                                          <IMG alt=\"\" border=0 height=1 src=\"../image/px.gif\"\n" +
            "                                             width=5>\n" +
            "                                       </TD>\n" +
            "                                       <TD width=183>\n" +
            "                                          <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0 height=\"294\">\n" +
            "                                             <TBODY>\n" +
            "                                                <TR>\n" +
            "                                                   <TD width=12 height=\"13\">\n" +
            "                                                      <IMG alt=\"\" border=0 height=11\n" +
            "                                                         src=\"../image/px.gif\" width=1>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD vAlign=top height=\"16\">\n" +
            "                                                      <!--  SEARCH table -->\n" +
            "                                                      <!--  END OF SEARCH TABLE -->\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"16\">\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"45\"></TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"52\">\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\"\n" +
            "                                                         border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD>\n" +
            "                                                                  <p>&nbsp;</p>\n" +
            "                                                               </TD>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20></TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"38\">\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=\"100%\"\n" +
            "                                                         border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD></TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20>\n" +
            "                                                                  <b>\n" +
            "                                                                  <font size=\"2\">\n" +
            "                                                                  <a href=\"vitavireval.php\">REVALUATION RESULTS</a>\n" +
            "                                                                  </font>\n" +
            "                                                                  </b>\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"38\">\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=183 border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"38\">\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=183 border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD>\n" +
            "                                                                  <b></b>\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                                <TR>\n" +
            "                                                   <TD height=\"38\">\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=183 border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD colSpan=2 height=20>&nbsp;</TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                             </TBODY>\n" +
            "                                          </TABLE>\n" +
            "                                       </TD>\n" +
            "                                       <TD width=5></TD>\n" +
            "                                    </TR>\n" +
            "                                 </TBODY>\n" +
            "                              </TABLE>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                     </TBODY>\n" +
            "                  </TABLE>\n" +
            "               </TD>\n" +
            "               <!-- end of first column -->\n" +
            "               <!-- second column -->\n" +
            "               <TD vAlign=top width=428 height=\"721\">\n" +
            "                  <TABLE cellSpacing=0 cellPadding=0 width=428 border=0>\n" +
            "                     <TBODY>\n" +
            "                        <TR>\n" +
            "                           <TD vAlign=top>\n" +
            "                              <table cellspacing=0 cellpadding=0 border=0 width=\"519\">\n" +
            "                                 <tbody>\n" +
            "                                    <tr>\n" +
            "                                       <td>\n" +
            "                                          <a href=\"../about.html\" onClick=\"return menuPop(this);\"\n" +
            "                                             onMouseOut=\"rollover('about','off');\" onMouseOver=\"rollover('about','on');menuPop(this);\" > </a>\n" +
            "                                       </td>\n" +
            "                                       <td>\n" +
            "                                          <a href=\"../admin_vtu.php\" onMouseOut=\"rollover('administration','off');\" onMouseOver=\"rollover('administration','on');\"> </a>\n" +
            "                                       </td>\n" +
            "                                       <td>&nbsp;</td>\n" +
            "                                       <td>\n" +
            "                                          <a href=\"../courses.html\" onClick=\"return menuPop(this);\"\n" +
            "                                             onMouseOut=\"rollover('courses','off');\" onMouseOver=\"rollover('courses','on');menuPop(this);\" > </a>\n" +
            "                                       </td>\n" +
            "                                       <td>\n" +
            "                                          <a onMouseOut=\"rollover('examinations','off');\" onMouseOver=\"rollover('examinations','on');\" href=\"exam_tt_vtu.php\"> </a>\n" +
            "                                       </td>\n" +
            "                                       <td>\n" +
            "                                          <a href=\"../regions.html\" onClick=\"return menuPop(this);\"\n" +
            "                                             onMouseOut=\"rollover('regions','off');\" onMouseOver=\"rollover('regions','on');menuPop(this);\" ></a>\n" +
            "                                       </td>\n" +
            "                                       <td width=\"57\">\n" +
            "                                          <a href=\"../vitavi.php\" onMouseOut=\"rollover('news','off');\" onMouseOver=\"rollover('news','on');\"></a>\n" +
            "                                       </td>\n" +
            "                                    </tr>\n" +
            "                                 </tbody>\n" +
            "                              </table>\n" +
            "                              <!-- MAIN TOP NAVIGATION TABLE -->\n" +
            "                              <!-- MAIN TOP NAVIGATION TABLE -->\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD vAlign=top></TD>\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD bgColor=#ffffff>\n" +
            "                              <TABLE cellSpacing=0 cellPadding=0 width=\"100%\" border=0>\n" +
            "                                 <TBODY>\n" +
            "                                    <TR>\n" +
            "                                       <TD vAlign=top align=right colSpan=2>\n" +
            "                                          <IMG alt=\"\" border=0\n" +
            "                                             height=15 src=\"../image/bevel.gif\" width=15>\n" +
            "                                       </TD>\n" +
            "                                    </TR>\n" +
            "                                    <TR>\n" +
            "                                       <TD vAlign=top align=left>\n" +
            "                                          <table border = 0 width = 100% >\n" +
            "                                             <tr>\n" +
            "                                                <td>\n" +
            "                                                   <br>&nbsp;&nbsp;January 27, 2016 \n" +
            "                                                   <br>\n" +
            "                                                </td>\n" +
            "                                             </tr>\n" +
            "                                          </table>\n" +
            "                                          <TABLE cellSpacing=0 cellPadding=4 width=\"100%\" border=0>\n" +
            "                                             <TBODY>\n" +
            "                                                <TR>\n" +
            "                                                   <TD>\n" +
            "                                                      <TABLE cellSpacing=0 cellPadding=0 width=515 bgColor=#ffffff border=0>\n" +
            "                                                         <TBODY>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD>\n" +
            "                                                                  <h4 class=\"style1\"> RESULTS (PROVISIONAL)</h4>\n" +
            "                                                                  <h4>\n" +
            "                                                                     <br>\n" +
            "                                                                     <br>\n" +
            "                                                                     </b>\n" +
            "                                                                     <br>\n" +
            "                                                                     &nbsp;\n" +
            "                                                                  </h4>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD width=\"513\">\n" +
            "                                                                  <B>RANJITHA P (1EW12CS085) </B>\n" +
            "                                                                  <br>\n" +
            "                                                                  <br>\n" +
            "                                                                  <br>\n" +
            "                                                                  <br>\n" +
            "                                                                  <hr>\n" +
            "                                                                  <table>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td>\n" +
            "                                                                           <b>Semester:</b>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td>\n" +
            "                                                                           <b>7</b>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td></td>\n" +
            "                                                                        <td> &nbsp;&nbsp;&nbsp;&nbsp;\n" +
            "                                                                           <b> Result:&nbsp;&nbsp;FIRST CLASS </b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                  </table>\n" +
            "                                                                  <hr>\n" +
            "                                                                  <table>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>Subject</td>\n" +
            "                                                                        <td width=60 align=center>External </td>\n" +
            "                                                                        <td width=60 align=center>Internal</td>\n" +
            "                                                                        <td align=center width=60>Total</td>\n" +
            "                                                                        <td align=center width=60>Result</td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <br>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Object-Oriented Modeling & Design (10CS71)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>61</td>\n" +
            "                                                                        <td width=60 align=center>23</td>\n" +
            "                                                                        <td width=60 align=center>84</td>\n" +
            "                                                                        <td  width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>C# Programming & .Net (10CS761)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>46</td>\n" +
            "                                                                        <td width=60 align=center>25</td>\n" +
            "                                                                        <td width=60 align=center>71</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Embedded Computing Systems (10CS72)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>41</td>\n" +
            "                                                                        <td width=60 align=center>25</td>\n" +
            "                                                                        <td width=60 align=center>66</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Programming the Web (10CS73)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>38</td>\n" +
            "                                                                        <td width=60 align=center>19</td>\n" +
            "                                                                        <td width=60 align=center>57</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Java & J2EE (10CS753)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>41</td>\n" +
            "                                                                        <td width=60 align=center>22</td>\n" +
            "                                                                        <td width=60 align=center>63</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Advanced Computer Architectures (10CS74)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>46</td>\n" +
            "                                                                        <td width=60 align=center>22</td>\n" +
            "                                                                        <td width=60 align=center>68</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Networks Lab. (10CSL77)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>40</td>\n" +
            "                                                                        <td width=60 align=center>24</td>\n" +
            "                                                                        <td width=60 align=center>64</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td width=250>\n" +
            "                                                                           <i>Web Programming Lab. (10CSL78)</i>\n" +
            "                                                                        </td>\n" +
            "                                                                        <td width=60 align=center>47</td>\n" +
            "                                                                        <td width=60 align=center>22</td>\n" +
            "                                                                        <td width=60 align=center>69</td>\n" +
            "                                                                        <td width=60 align=center>\n" +
            "                                                                           <b>P</b>\n" +
            "                                                                        </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                  </table>\n" +
            "                                                                  <br>\n" +
            "                                                                  <br>\n" +
            "                                                                  <table>\n" +
            "                                                                     <tr>\n" +
            "                                                                        <td></td>\n" +
            "                                                                        <td></td>\n" +
            "                                                                        <td>Total Marks:</td>\n" +
            "                                                                        <td> 542 &nbsp;&nbsp;&nbsp; </td>\n" +
            "                                                                     </tr>\n" +
            "                                                                  </table>\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD width=\"513\">\n" +
            "                                                                  <ul>\n" +
            "                                                                  </ul>\n" +
            "                                                                  <p align=\"right\">\n" +
            "                                                                     <b>Sd/-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n" +
            "                                                                     </b>\n" +
            "                                                                  </p>\n" +
            "                                                                  <p align=\"right\">\n" +
            "                                                                     <b>REGISTRAR(EVALUATION)</b>\n" +
            "                                                                  </p>\n" +
            "                                                                  <TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
            "                                                                     <TBODY>\n" +
            "                                                                        <TR>\n" +
            "                                                                           <TD width=5>\n" +
            "                                                                              <IMG alt=\"\" border=0\n" +
            "                                                                                 height=1 src=\"../image/px.gif\" width=5>\n" +
            "                                                                           </TD>\n" +
            "                                                                           <TD vAlign=top></TD>\n" +
            "                                                                           <TD width=\"99%\"\n" +
            "                                                                              background=../image/line.gif>\n" +
            "                                                                              <IMG alt=\"\"\n" +
            "                                                                                 border=0 height=1 src=\"../image/px.gif\"\n" +
            "                                                                                 width=300>\n" +
            "                                                                           </TD>\n" +
            "                                                                           <TD width=5>\n" +
            "                                                                              <IMG alt=\"\" border=0\n" +
            "                                                                                 height=1 src=\"../image/px.gif\"\n" +
            "                                                                                 width=5>\n" +
            "                                                                           </TD>\n" +
            "                                                                        </TR>\n" +
            "                                                                     </TBODY>\n" +
            "                                                                  </TABLE>\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD width=\"513\">\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD width=\"513\">\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                            <TR>\n" +
            "                                                               <TD width=\"513\">\n" +
            "                                                                  <TABLE cellSpacing=0 cellPadding=0 border=0>\n" +
            "                                                                     <TBODY>\n" +
            "                                                                        <TR>\n" +
            "                                                                           <TD width=5>\n" +
            "                                                                              <IMG alt=\"\" border=0\n" +
            "                                                                                 height=1 src=\"../image/px.gif\"\n" +
            "                                                                                 width=5>\n" +
            "                                                                           </TD>\n" +
            "                                                                        </TR>\n" +
            "                                                                     </TBODY>\n" +
            "                                                                  </TABLE>\n" +
            "                                                               </TD>\n" +
            "                                                            </TR>\n" +
            "                                                         </TBODY>\n" +
            "                                                      </TABLE>\n" +
            "                                                   </TD>\n" +
            "                                                </TR>\n" +
            "                                             </TBODY>\n" +
            "                                          </TABLE>\n" +
            "                                       </TD>\n" +
            "                                       <TD vAlign=top>\n" +
            "                                          <IMG alt=\"\" border=0 height=420\n" +
            "                                             src=\"../image/px.gif\" width=1>\n" +
            "                                       </TD>\n" +
            "                                    </TR>\n" +
            "                                    <TR>\n" +
            "                                       <TD vAlign=top colSpan=2>\n" +
            "                                          <!--<TABLE cellSpacing=0 cellPadding=1 width=\"100%\" border=0><TBODY><TR bgColor=#809cc9><TD><A onmouseover=\"rollover('legal','on');\"\n" +
            "                                             onmouseout=\"rollover('legal','off');\"\n" +
            "                                             href=\"\"><IMG\n" +
            "                                             alt=\"\" border=0 height=19 name=legal\n" +
            "                                             src=\"../image/legal.gif\" width=91></A></TD><TD align=right><A\n" +
            "                                             onmouseover=\"rollover('privacy','on');\"\n" +
            "                                             onmouseout=\"rollover('privacy','off');\"\n" +
            "                                             href=\"\"><IMG\n" +
            "                                             alt=\"\" border=0 height=19 name=privacy\n" +
            "                                             src=\"../image/privacy.gif\"\n" +
            "                                             width=39></A></TD></TR></TBODY></TABLE>-->\n" +
            "                                       </TD>\n" +
            "                                    </TR>\n" +
            "                                 </TBODY>\n" +
            "                              </TABLE>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                     </TBODY>\n" +
            "                  </TABLE>\n" +
            "               </TD>\n" +
            "               <!-- end of second column -->\n" +
            "               <TD vAlign=top height=\"721\">\n" +
            "                  <TABLE cellSpacing=0 cellPadding=0 width=140 border=0 height=\"367\">\n" +
            "                     <TBODY>\n" +
            "                        <TR>\n" +
            "                           <TD width=6 height=\"16\">\n" +
            "                              <IMG alt=\"\" border=0 height=1 src=\"../image/px.gif\"\n" +
            "                                 width=6>\n" +
            "                           </TD>\n" +
            "                           <TD vAlign=top height=\"16\">\n" +
            "                              <!--<TABLE cellSpacing=0 cellPadding=0 border=0><TBODY><TR><TD vAlign=top><A href=\"vitavi.php\" onmouseout=\"rollover('mediakit','off');\" onmouseover=\"rollover('mediakit','on');\" ><IMG align=left border=0 height=21 name=mediakit src=\"../image/mediakitoff.gif\" width=57></A></TD></TR><TR><TD vAlign=top><A href=\"vitavi.php\" onmouseout=\"rollover('contactus','off');\" onmouseover=\"rollover('contactus','on');\" ><IMG align=left border=0 height=21 name=contactus src=\"../image/contactusoff.gif\" width=74></A></TD></TR><TR><TD vAlign=top><IMG align=left border=0 height=21 src=\"../image/kb_off.gif\" width=110></TD></TR></TBODY></TABLE>-->\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                        <TR>\n" +
            "                           <TD height=\"351\"></TD>\n" +
            "                           <TD vAlign=top height=\"351\" align=\"left\">\n" +
            "                              &nbsp;\n" +
            "                              <p>&nbsp;</p>\n" +
            "                              <p>&nbsp;</p>\n" +
            "                              <p>&nbsp;</p>\n" +
            "                              <p>&nbsp;</p>\n" +
            "                              <p>\n" +
            "                           </TD>\n" +
            "                        </TR>\n" +
            "                     </TBODY>\n" +
            "                  </TABLE>\n" +
            "               </TD>\n" +
            "               <!-- end of third column -->\n" +
            "            </TR>\n" +
            "         </TBODY>\n" +
            "      </TABLE>\n" +
            "   </BODY>\n" +
            "</HTML>";
    public static void main(String vp[]){
        parseResult(result);
       // System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(parseResult(result)));
    }

    public static Student parseResult(String result){
        result = Jsoup.parse(result).body().toString();
        result= result.trim().replaceAll("<[^>]*>","")
                .replaceAll("(?m)^\\s*$[\n\r]+", "")
                .replaceAll("(&nbsp;)|(-->)","")
                .replaceAll("\\d{4}-\\d{2}-\\d{2}","")
                .replaceAll("(\\w+).(\\d{2},.(\\d{4}))","")
                .replaceAll("(REVALUATION RESULTS) | (RESULTS \\(PROVISIONAL\\)) | (Sd/-    REGISTRAR\\(EVALUATION\\)) ","")
                .replaceAll("(Subject)|(External)|(Internal)|(Total)|(Result$)","");
        StringBuffer buf = new StringBuffer();
        Arrays.asList(result.split("\n")).stream().filter(line -> !line.matches("\\s+")).forEach(line -> buf.append(line.trim()).append("\n"));
//        System.out.println(s.trim().replaceAll("^\\s+", "\n"));
        System.out.println(buf.toString());

        return null;
    }
}
