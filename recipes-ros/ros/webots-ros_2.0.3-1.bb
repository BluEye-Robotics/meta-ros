DESCRIPTION = "The ROS package containing examples for interfacing ROS with the standard ROS controller of Webots"
AUTHOR = ""
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy roscpp std-msgs sensor-msgs message-generation tf rospy roscpp std-msgs sensor-msgs message-runtime tf"

RDEPENDS_${PN} = "rospy roscpp std-msgs sensor-msgs message-runtime tf"

SRC_URI = "https://github.com/omichel/webots_ros-release/archive/release/melodic/webots_ros/2.0.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "29b076453f5ec5182cbb23e90c11e525"
SRC_URI[sha256sum] = "5e29fc8f6a8f9d1030043e047589dc915c28b57515f0621fdc3c9599f329d5a6"

S = "${WORKDIR}/webots_ros-release-release-melodic-webots_ros-2.0.3-1"

inherit catkin
