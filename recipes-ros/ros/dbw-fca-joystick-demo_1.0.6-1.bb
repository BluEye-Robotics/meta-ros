DESCRIPTION = "Demonstration of drive-by-wire with joystick"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs dbw-fca-msgs"

RDEPENDS_${PN} = "roslaunch joy dbw-fca-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_joystick_demo/1.0.6-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "33696a4a1d0ba2cf18a56a47d3e71ae5"
SRC_URI[sha256sum] = "0e76c63bbc9bde6a5d6348a3f0656001284ba66c589e6df91211bc9365f3f5c7"

ROS_SPN = "dbw_fca_ros"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca_joystick_demo-1.0.6-1"

inherit catkin
