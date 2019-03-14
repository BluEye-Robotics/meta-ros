DESCRIPTION = "Basic message types for two dimensional navigation, extending from geometry_msgs::Pose2D."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/nav_2d_msgs/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8bb20664943fa777fabce0d585c01348"
SRC_URI[sha256sum] = "a69fbc32255ea51112ab78b8b5b2b8c4b38ec8263bd961558c0a7a66bf89eb20"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-nav_2d_msgs-0.2.5-1"

inherit catkin
