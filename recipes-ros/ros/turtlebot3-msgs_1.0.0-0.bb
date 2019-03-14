DESCRIPTION = "Message and service types: custom messages and services for TurtleBot3 packages"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_msgs-release/archive/release/melodic/turtlebot3_msgs/1.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1e96d2e1e240dc3e6de68a3a527d9a6f"
SRC_URI[sha256sum] = "45317e8776023604286708e4f7f9b206d3d64e59601af91849a5f80b94cbd0db"

S = "${WORKDIR}/turtlebot3_msgs-release-release-melodic-turtlebot3_msgs-1.0.0-0"

inherit catkin
