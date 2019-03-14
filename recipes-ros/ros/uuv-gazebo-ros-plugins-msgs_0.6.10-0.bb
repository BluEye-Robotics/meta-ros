DESCRIPTION = "The uuv_gazebo_ros_plugins_msgs package"
AUTHOR = "Musa Morena Marcusso Manhaes"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = "message-generation std-msgs geometry-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_ros_plugins_msgs/0.6.10-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f7a40be59da15a4630098a047e2186ca"
SRC_URI[sha256sum] = "96a334617334392149c77d98328629f0e3b4af4058b5fd75c500e5e7971d1141"

ROS_SPN = "uuv_simulator"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_ros_plugins_msgs-0.6.10-0"

inherit catkin
