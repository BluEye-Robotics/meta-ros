DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Nuno Marques"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cmake-modules roscpp std-msgs geometry-msgs tf2-ros mavros mavros-extras libeigen eigen-conversions control-toolbox"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/0.33.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70a200815332871ae063fe6e2eaa4277"
SRC_URI[sha256sum] = "4273f813bb7415feae16331ce3bebe5e6df127f42c7c22aeb1fd1d1866b5f0e7"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-test_mavros-0.33.0-1"

inherit catkin
