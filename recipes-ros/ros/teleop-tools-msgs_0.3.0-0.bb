DESCRIPTION = "The teleop_tools_msgs package"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs control-msgs message-generation actionlib-msgs control-msgs message-runtime"

RDEPENDS_${PN} = "actionlib-msgs control-msgs message-runtime"

SRC_URI = "https://github.com/ros-gbp/teleop_tools-release/archive/release/melodic/teleop_tools_msgs/0.3.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "904798b8f19d593e04f4a7370e8a7b13"
SRC_URI[sha256sum] = "6a087baf64271603f7708582a440c2fe47f15f2da8be3996b115ad707ee05366"

ROS_SPN = "teleop_tools"
S = "${WORKDIR}/teleop_tools-release-release-melodic-teleop_tools_msgs-0.3.0-0"

inherit catkin
