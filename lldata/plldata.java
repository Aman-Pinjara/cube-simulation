package lldata;
class plldata {

  public static String[][] pll = {
      // "Aa"
      {
          "R' B' R2 D R' U' R D' R' U R' B R",
          "R' F R' B2 R F' R' B2 R2",
          "F U R2 D R' U' R D' R' U R' U' F'",
          "R' D' R U' R' D R U2 R' D' R U' R' D R",
          "R' U' D' R' D R U' R' D' R U2 D R",
          "R F R' U R' D' R U' R' D R2 F' R'",
          "R' D R U' R' D' R U' R' D R U2 R' D' R",
          "R' D' R U2 R' D R U' R' D' R U' R' D R",
          "R U2 D R D' R' U' R D R' U' D' R'",
          "F U2 R' D' R U' R' D R U' F'"
      },
      // "Ab"
      {
          "R' B' R U' R D R' U R D' R2 B R",
          "R' D' R U2 R' D R U R' D' R U R' D R",
          "R2 B2 R F R' B2 R F' R",
          "F U R U' R D R' U R D' R2 U' F'",
          "R' D' R U R' D R U2 R' D' R U R' D R",
          "R F R2 D' R U R' D R U' R F' R'",
          "L F' L B2 L' F L B2 L2",
          "R' F' R U R U' R2 F R U R' F' R F",
          "F U R' D' R U R' D R U2 F'",
          "R' D R U2 R' D' R U R' D R U R' D' R"
      },
      // "E"
      {
          "R' U' R' D' R U' R' D R U R' D' R U R' D R2",
          "R2 U F' R' U R U' R' U R U' R' U R U' F U' R2",
          "R' U' D' R' D F D' R U D R U' R' F' R",
          "F U' R U' R U R' U R U2 R' U R' U' R U2 R' F'",
          "L U' R D2 R' U R L' U' L D2 L' U R'",
          "R' F R U R' D' U' R' D F' D' R D U R",
          "F U' R U' R' U2 R U' R' U R' U2 R U R' U R F'",
          "R' D F R U R' D' U' R' D F' D' R U R",
          "L2 U2 F U L U' L' U L U' L' U L U' L' F' U2 L2",
          "R2 U R2 U D R2 U' R2 U R2 U' D' R2 U R2 U2 R2"
      },
      // "F"
      {
          "R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R",
          "R2 F R F' R' U' F' U F R2 U R' U' R",
          "L U F L' U' L U L F' L2 U L U L' U' L U' L'",
          "R U2 R U R' D R D' R U' D R2 U R2 D' R' U R'",
          "F' U R' U' F' R U R' U' R' F R2 U' R' U' R U R' U R U' F",
          "R U R' U R U' R2 F' U' F U R F R' F' R2 U2 R'",
          "R U R' U' R' U R U2 L' R' U R U' L U' R U' R'",
          "R' U' F' R D' R U' R' D R U R U R U' R' U' R U' R' U R F U R",
          "R U' R' U R2 B U B' U' R' B' R B R2",
          "L R2 U R U R2 U' R' U' R2 U' R U2 L' U R'"
      },
      // "Ga"
      {
          "D' R2 U R' U R' U' R U' R2 U' D R' U R",
          "R U R' F' R U R' U' R' F R U' R' F R2 U' R' U' R U R' F'",
          "R U R' U' R' U F R U R U' R' F' U R' U2 R",
          "R F U' D R' U2 R D' R' U R U F' U R'",
          "F R U' R' U R U R2 F' U2 R U R U' R2 U2 R",
          "R D L' D2 R D' L' F2 D' L2 D' R2",
          // big mistake v it is l at end change that
          "F2 D R' U R' U' R D' F2 L' U L",
          "R2 U R' U R' U' R U' R2 D U' R' U R D'",
          "L2 F2 L' U2 L' U2 L F' L' U' L U L F' L2"
      },
      // "Gb"
      {
          "R' U' R U D' R2 U R' U R U' R U' R2 D",
          "L' U' L U D' L2 U L' U L U' L U' L2 D",
          "R' U2 R2 U R' U' R' U2 F R2 U' R' U' R U R' F'",
          "R2 D L2 D F2 L D R' D2 L D' R' U'",
          "R' U2 R U' F R U R' U' R' F' U' R U R U' R'",
          "R2 F2 R' U R' F' R U R' U' R' F R2 U' R F2 R2",
          "R' U' R B2 D L' U L U' L D' B2",
          "L' U' L F2 D R' U R U' R D' F2",
          "R' U' R U D' R2 U R' U R U' R U' R2 D",
          "R' F' R U R U R' U' R U' R' F R U R' U R U R' U' R U' R'"
      },
      // "Gc"
      {
          "R' U2 R' D' R U' R' D R U R U' R2 U' R' U' R' U R U R2",
          "R2 U' R U' R U R' U R2 U D' R U' R' D",
          "F2 D' L U' L U L' D F2 R U' R'",
          "R D' R2 U' R2 U R' U R U2 R' U R' U R2 D R'",
          "R2 U' R U' R U R' U R' F' R' U R U' F R'",
          "R' U' R U' R2 D R' U R D' R U R U' R U' R'",
          "R' D' R' U' R D U' R D' U R' U R D R U R U' R'",
          "R2 F' R D R' U' R' U' R U2 R' U' R2 D' R' F R2",
          "F R U R' F R2 F' R' U' R' F' U2 R' U R"
      },
      // "Gd"
      {
          "R U R' F' L' U' L U L F' L' F2 R U R' U' L' U2 R U R' U2 L",
          "R2 U' R' U' R U R U R2 U R' U' R' D' R U R' D R U2 R",
          "R U R' F2 D' L U' L' U L' D F2",
          "R U R' U' D R2 U' R U' R' U R' U R2 D'",
          "R' U' F' R U R' U' R' F R2 U' R' U R U R U R' U R U2 R' U'",
          "R U R' U' D R2 U' R U' R' U R' U R2 D'",
          "L U2 L' U F' L' U' L U L F U L' U' L' U L",
          "R U R' F' R U R' U R U' R' U' R' F R2 U R' U' R U' R'",
          "R2 F' R U R U' R' F' R U2 R' U2 R' F2 R2",
          "L U L' U' D L2 U' L U' L' U L' U L2 D'"
      },
      // "H"
      {
          "R U R2 F' R U2 R U' R' U' R' F R2 U R' U' R U' R'",
          "R2 F2 B2 L2 D R2 F2 B2 L2",
          "R2 U2 R2 U2 R2 U' R2 U2 R2 U2 R2",
          "R' U2 R2 U2 R2 U' R2 U' R' U' R' U2 R",
          "R U R' U2 R U' R' U' R U' R' U2 R U' R' U' R U2 R'",
          "R2 F2 D2 L2 B2 L2 B2 L2 B2 D2 F2 R2",
          "R U2 R' U' R' U' R2 U' R2 U2 R2 U2 R'",
          "R L U2 R' L' F' B' U2 F B",
          "L2 R2 D L2 R2 U2 L2 R2 D L2 R2"
      },
      // "Ja"
      {
          "R' U' R B R' U' R U R B' R2 U R U",
          "R' U2 R U R' U2 L U' R U L'",
          "R U R' U' R' F R2 U' R' U2 R U R' F' R U R' U' R' F R F'",
          "R F R' U R F' R2 U F U2 F' U' R",
          "R' L' U2 R U R' U2 L U' R",
          "R2 U' R2 D R2 U' R2 U R2 U D' R2",
          "F' U' F R' U' R F' R' U R U F U'",
          "R F R' U R F' R' U2 R F R' U R F' R'",
          "R' U L' U2 R U' R' U2 R L U'",
          "R2 F2 U' F2 D R2 D' R2 U R2"
      },
      // "Jb"
      {
          "R U' F U' R' U' R U F' U2 R'",
          "F2 R2 U R2 U' R2 D R2 D' F2",
          "R U R2 F R2 U' R' U' R U R' F' R U R' U' R U' R'",
          "R U R2 F' R U R U' R' F R U' R'",
          "R2 D' R' D R' B2 L U' L' B2",
          "R2 U D' R2 U R2 U' R2 D R2 U' R2",
          "R U' L U2 R' U R U2 R' L'",
          "R U2 R' U' R U2 L' U R' U' L U",
          "R' U2 R U R' F' R U R' U' R' F R2 U' R' U R",
          "R2 U R2 D' R2 D B2 U' B2 R2"
      },
      // "Na"
      {
          "F U' B U2 F' U B' F U' B U2 F' U B' U",
          "R U' L U2 R' U R L' U' L U2 R' U L'",
          "R U R' U' R' U' R U F' U' F U' R' U2 F R F'",
          "R2 U R2 U' D' R2 D R2 U2 R2 U R2 U' D' R2 D R2 U",
          "R U' L U2 R' U L' R U' L U2 R' U L' U'",
          "R U R' U R U2 R' U' R U2 L' U R' U' L U' R U' R'",
          "R U R' U R U R' F' R U R' U' R' F R2 U' R' U2 R U' R'",
          "R U' R2 B2 D' L F2 L' D B2 R2 U R'",
          "R F R' F' R U R' U' R' F R2 U' R' U' R U F' R'"
      },
      // "Nb"
      {
          "R' U L' U2 R U' R' L U L' U2 R U' L",
          "R2 D R D' R2 U R' D U2 R' U2 R U2 R D'",
          "F' D R2 F2 U B' R2 B U' F2 R2 D' F",
          "R' U' R U L' U2 L U L' U2 R U' L U R' U' R' U R",
          "R U' R2 F2 U' R F2 R' U F2 R2 U R'",
          "R' U' R U2 R' U L' U2 R U' R' U2 R L U R' U R",
          "R' U2 R' U2 R U2 D' R U' R2 D R' D' R2 D",
          "R' U L' U2 R U' L R' U L' U2 R U' L U'",
          "R' U2 D R' U R2 D' R D R2 U' D' R U2 R",
          "D' R2 D R D' R2 U R' D U2 R' U2 R U2 R"
      },
      // "Ra"
      {
          "F R' F' R U' F' U' L' U' L F R U2 R'",
          "R U2 R' U2 R B' R' U' R U R B R2 U",
          "R U' R F2 U R U R U' R' U' F2 R2",
          "R U' R' U' R U R D R' U' R D' R' U2 R'",
          "R2 F2 U R U R' U' R' U' F2 R' U R'",
          "L U R' D R U R' D' R L' U L U L'",
          "R U2 R2 F R F' R U' R' F' U F R U' R'",
          "R U2 R D R' U R D' R' U' R' U R U R'",
          "R U' R2 D' R U R' D R U' R U' R' U R U R'",
          "L U2 L' U2 L F' L' U' L U L F L2 U"
      },
      // "Rb"
      {
          "R' U' L D' L' U' L D L' R U' R' U' R",
          "R' U2 R U2 R' F R U R' U' R' F' R2 U'",
          "R' U R U R' U' R U' R D R' U R D' R2 U' R",
          "R U2 F U' R' U R D R' U R U D' F' R'",
          "R2 F R U R U' R' F' R U2 R' U2 R",
          "L' U L2 D L' U' L D' L' U L' U L U' L' U' L",
          "L2 F2 U' L' U' L U L U F2 L U' L",
          "L' U' L F L' U2 L U2 L F' L' U' L' U2 L"
      },
      // "T"
      {
          "R U R' U' R' F R2 U' R' F' U L F' L' F",
          "R U R' U' R U' R' U' R U R' F' R U R' U' R' F R U R U' R'",
          "R2 D B2 D' R2 F2 D' L2 D F2",
          "R U R' U' R2 D R' U' R' U' R U R2 D' R",
          "R D' R U' R' D R U R U R U' R' U' R U' R' U R",
          "R2 U R2 D' F2 L2 U' L2 D F2",
          "L' U' L U L F' L2 U L U' F R U' R'",
          "F R U' R' U R U R2 F' R U R U' R'",
          "R2 U R2 U' R2 U' D R2 U' R2 U R2 D'",
          "R2 U R2 U' R2 F2 U' F2 D R2 D'"
      },
      // "Ua"
      {
          "R2 U' R' U' R U R U R U' R",
          "R2 U' F B' R2 F' B U' R2",
          "R U' R U R U R U' R' U' R2 U2",
          "R2 U F2 L2 B2 D' B2 L2 F2 U2 R2",
          "R U R' U' R' U2 R U R U' R2 U2 R",
          "R U R' U' L' U' L U2 R U' R' U' L' U L",
          "R U2 R U R U R2 U' R' U' R2",
          "L U' L U L U L U' L' U' L2"
      },
      // "Ub"
      {
          "R U R' U R U' R' U L' U' L U' R U' R' U L' U L U'",
          "R2 U R U R' U' R' U' R' U R'",
          "R' U' R U' R U R2 U R U' R U' R'",
          "R' U2 R2 U R' U' R' U2 R U R U' R'",
          "L2 U L U L' U' L' U' L' U L'",
          "B2 U L' R B2 R' L U B2",
          "L' U L' U' L' U' L' U L U L2 U2",
          "R' U R' U' R' U' R' U R U R2",
          "F2 U L R' F2 L' R U F2",
          "L' U' L U' L U L2 U L U' L U' L'"
      },
      // "V"
      {
          "R U' R F2 R' U R' U' R2 U' F2 U F2 D' F2 D R2",
          "D R U2 R' D R U' R U' R U R2 D R' U' R D",
          "R U F' B2 L' B2 L F U2 L U R' U L'",
          "R' F' R U R' U' R' F R2 U' R' U2 R' D' R U2 R' D R U2 R",
          "R2 U' B2 U B2 R D' R D R' U R U' R",
          "R U2 R' U2 L' U R U' L U' L' U R' U' L",
          //mistake remove this
          // "D' R2 D R2 U R' D' R U' R U R' D R U'",
          "R U2 R' D R U' R U' R U R2 D R' U' R D2",
          "R U' L' U R' U' R U' L U R' U2 L' U2 L",
          "R' U R' U' B' R' B2 U' B' U B' R B R"
      },
      // "Y"
      {
          "R' F' R U R' L' U2 R U R' U2 L U' F R",
          "R' U' R U' R U2 R' U' R U2 L' U R' U' L U R' U R",
          "R U R2 U L' U2 R U' R' U2 R L U' R U' R'",
          "F R U' R' U' R U R' F' R U R' U' R' F R F'",
          "F R' F' R U R U' R2 U' R U R B' R' B",
          "R' U2 R U' R' F2 R U2 R U2 R' F2 R' U' R2 U' R'",
          "F2 D R2 U R2 D' R' U' R F2 R' U R",
          "R' U' R F2 R' U R D R2 U' R2 D' F2",
          "R2 U' R2 U' R2 U R' F' R U R2 U' R' F R"
      },
      // "Z"
      {
          "R' U2 R U' R2 F' R U R U R' U2 R' F R U' R",
          "L R U2 L R' U F2 L2 F2 U L2 U F2 L2 F2 U L2",
          "R U2 R' U' R' F' R U2 R U' R' U' R' F R2 U' R'",
          "R' U' R U' R U R U' R' U R U R2 U' R' U",
          "R U R' U R' U' R' U R U' R' U' R2 U R",
          "R' U' R2 U R U R' U' R U R U' R U' R'",
          "L2 R2 D L2 R2 U L R' F2 L2 R2 B2 L R'",
          "R U R2 F' R U R U R' U2 R' F R U R U2 R'",
          "R2 U R2 U' R2 F2 R2 U' F2 U R2 F2"
      }
  };
}