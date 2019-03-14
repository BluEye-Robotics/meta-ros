DESCRIPTION = "This package contains messages used by robot_activity, such as node's state and error"
AUTHOR = "Maciej ZURAD"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "std-msgs message-generation message-runtime"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity_msgs/0.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "11d885f8f9426cdd18b130fd9ac8f42a"
SRC_URI[sha256sum] = "c7047f132a865f58489413a1bb4e9c08ffe2014f3d404b4874f399eefeb9872e"

ROS_SPN = "robot_activity"
S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity_msgs-0.1.1-0"

inherit catkin
