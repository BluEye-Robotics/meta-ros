DESCRIPTION = "uuv_simulator contains Gazebo plugins and ROS packages for modeling and simulating unmanned underwater vehicles"
AUTHOR = "Luiz Ricardo Douat"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-assistants uuv-auv-control-allocator uuv-control-cascaded-pid uuv-control-msgs uuv-control-utils uuv-thruster-manager uuv-trajectory-control uuv-descriptions uuv-gazebo uuv-gazebo-plugins uuv-gazebo-ros-plugins uuv-gazebo-ros-plugins-msgs uuv-gazebo-worlds uuv-sensor-ros-plugins-msgs uuv-sensor-ros-plugins uuv-teleop uuv-world-plugins uuv-world-ros-plugins uuv-world-ros-plugins-msgs"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_simulator/0.6.13-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5cf7ab24e2377029a21c7573dbaca82d"
SRC_URI[sha256sum] = "9dd981efd3c5ceb4f4d7d731f41fdc26eb321a02bf3ab8b8e40b866e5c56e457"

S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_simulator-0.6.13-0"

inherit catkin
