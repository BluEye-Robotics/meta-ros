DESCRIPTION = "The ROS package containing examples for interfacing ROS with the standard ROS controller of Webots"
AUTHOR = "Cyberbotics"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy roscpp std-msgs sensor-msgs message-generation tf rospy roscpp std-msgs sensor-msgs message-runtime tf"

RDEPENDS_${PN} = "rospy roscpp std-msgs sensor-msgs message-runtime tf"

SRC_URI = "https://github.com/cyberbotics/webots_ros-release/archive/release/melodic/webots_ros/2.0.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "52197e2cedb6204cc1f3365b3a49871d"
SRC_URI[sha256sum] = "af8cddb4486838d1bd6bc1bdecae612faa1b03b47d06c7a5d7dce0a3b999bb69"

S = "${WORKDIR}/webots_ros-release-release-melodic-webots_ros-2.0.5-1"

inherit catkin
