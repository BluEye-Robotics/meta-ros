DESCRIPTION = "The uuv_gazebo_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_ros_plugins_msgs/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "eeb4519c17910d8bdcce9a87709305bd"
SRC_URI[sha256sum] = "b48e850ae31997516e36049b592f26939a20a278600d8b3f8168b8048a3b6a83"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_ros_plugins_msgs-0.6.13-0"

inherit catkin
