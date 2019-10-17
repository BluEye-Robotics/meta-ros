DESCRIPTION = "Demonstration of drive-by-wire with joystick"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs dbw-fca-msgs"

RDEPENDS_${PN} = "roslaunch joy dbw-fca-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_joystick_demo/1.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "08cc56b694b6b7843813bba6fd8bc6f0"
SRC_URI[sha256sum] = "7e0a5b980a8b2ec5a014e3acc25ed73986f5d141d87bf1483f73ce8944fe6b89"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_joystick_demo-1.0.1-0"

inherit catkin
