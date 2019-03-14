DESCRIPTION = "Message and service types: custom messages and services for TurtleBot3 Applications packages"
AUTHOR = "Pyo"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs sensor-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications_msgs-release/archive/release/melodic/turtlebot3_applications_msgs/1.0.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5f049da1bd3f3e4e461c25e099ae87db"
SRC_URI[sha256sum] = "1dc86e6606109d67a3f28c9bb18934265196c0d3b1338722bc8bc4f9454112cf"

S = "${WORKDIR}/turtlebot3_applications_msgs-release-release-melodic-turtlebot3_applications_msgs-1.0.0-1"

inherit catkin
