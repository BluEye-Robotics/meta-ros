DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Nuno Marques"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles cmake-modules roscpp std-msgs geometry-msgs tf2-ros mavros mavros-extras libeigen eigen-conversions control-toolbox"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/0.29.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4fd140aa3a47f7f530be1e74a2b2def3"
SRC_URI[sha256sum] = "de15444e834540abb574c250800527f2d808fe7590139785ea7df46a07b5fe87"

ROS_SPN = "mavros"
S = "${WORKDIR}/mavros-release-release-melodic-test_mavros-0.29.2-0"

inherit catkin
