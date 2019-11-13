DESCRIPTION = "PR2 specific plugins for MoveIt"
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake-modules moveit-core roscpp rosconsole kdl-parser urdf tf tf-conversions eigen-conversions pluginlib control-msgs pr2-mechanism-msgs pr2-controllers-msgs actionlib angles"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/moveit_pr2-release/archive/release/melodic/pr2_moveit_plugins/0.7.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "599722d373e6f1b9d944ac210f866175"
SRC_URI[sha256sum] = "c780573ef3305b96d9ef18be3a5fb1e8024324808209728e840457c047ecdb78"

ROS_SPN = "moveit_pr2"
S = "${WORKDIR}/moveit_pr2-release-release-melodic-pr2_moveit_plugins-0.7.3-1"

inherit catkin
