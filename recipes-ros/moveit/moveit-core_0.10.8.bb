DESCRIPTION = "Core libraries used by MoveIt!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslib boost eigen-conversions fcl octomap eigen-stl-containers geometric-shapes kdl-parser moveit-msgs srdfdom cmake-modules tf2-eigen tf2-kdl tf2-geometry-msgs"

require moveit.inc
