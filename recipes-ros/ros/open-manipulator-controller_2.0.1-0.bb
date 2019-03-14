DESCRIPTION = "OpenManipulator controller package"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-msgs sensor-msgs geometry-msgs moveit-msgs trajectory-msgs open-manipulator-msgs moveit-core moveit-ros-planning moveit-ros-planning-interface robotis-manipulator open-manipulator-libs cmake-modules boost"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_controller/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "5ce9cfee11723ed3cb12fd525f78035d"
SRC_URI[sha256sum] = "b19bbeab199f991d98fc26473d59f22d1501ae8954c2e413edae34a276ba334c"

ROS_SPN = "open_manipulator"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_controller-2.0.1-0"

inherit catkin
