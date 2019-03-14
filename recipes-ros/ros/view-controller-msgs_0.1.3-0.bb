DESCRIPTION = "Messages for (camera) view controllers"
AUTHOR = "Adam Leeper"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg message-generation geometry-msgs std-msgs message-runtime geometry-msgs std-msgs"

RDEPENDS_${PN} = "message-runtime geometry-msgs std-msgs"

SRC_URI = "https://github.com/ros-gbp/view_controller_msgs-release/archive/release/melodic/view_controller_msgs/0.1.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2b3e9f643ced8fd69d998c2d6a43dda5"
SRC_URI[sha256sum] = "9ee90391a7604f99bcc5ee9ef5f0dd0d7585247c3fd1c59f871eeee5f8cb739f"

S = "${WORKDIR}/view_controller_msgs-release-release-melodic-view_controller_msgs-0.1.3-0"

inherit catkin
