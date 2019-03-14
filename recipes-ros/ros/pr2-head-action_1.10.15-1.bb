DESCRIPTION = "The PR2 head action is a node that provides an action interface for pointing the head of the PR2. It passes trajectory goals to the controller, and reports success when they have finished executing."
AUTHOR = "Stuart Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs trajectory-msgs sensor-msgs pr2-controllers-msgs roscpp message-filters tf tf-conversions actionlib orocos-kdl kdl-parser geometry-msgs trajectory-msgs sensor-msgs pr2-controllers-msgs roscpp message-filters tf tf-conversions actionlib orocos-kdl kdl-parser"

RDEPENDS_${PN} = "geometry-msgs trajectory-msgs sensor-msgs pr2-controllers-msgs roscpp message-filters tf tf-conversions actionlib orocos-kdl kdl-parser"

SRC_URI = "https://github.com/pr2-gbp/pr2_controllers-release/archive/release/melodic/pr2_head_action/1.10.15-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1778bc378eadf06445a6a48cd3205813"
SRC_URI[sha256sum] = "3aca3955c0c33d9a3fd315a5d0d55048bd56ab49005650c5ca995a01c5137d70"

ROS_SPN = "pr2_controllers"
S = "${WORKDIR}/pr2_controllers-release-release-melodic-pr2_head_action-1.10.15-1"

inherit catkin
