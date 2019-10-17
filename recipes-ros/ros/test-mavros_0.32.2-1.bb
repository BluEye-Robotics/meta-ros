DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Nuno Marques"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cmake-modules roscpp std-msgs geometry-msgs tf2-ros mavros mavros-extras libeigen eigen-conversions control-toolbox"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/0.32.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "dc3819b39551e601df25dc163bd628fe"
SRC_URI[sha256sum] = "51ee9b778ff7dd5a94023e8b6de49f4c7da45cf28405ad382c2b459e1b6fa2bd"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-test_mavros-0.32.2-1"

inherit catkin
