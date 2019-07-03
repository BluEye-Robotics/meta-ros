DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Nuno Marques"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cmake-modules roscpp std-msgs geometry-msgs tf2-ros mavros mavros-extras libeigen eigen-conversions control-toolbox"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/0.31.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "d6ecfc73f88db7a6602a7f6e972e4cff"
SRC_URI[sha256sum] = "646d5cfb6db628af2b685a712ace5b099a4297dac69234cbc76d5f5e6b2fa54c"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-test_mavros-0.31.0-1"

inherit catkin
