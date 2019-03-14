DESCRIPTION = "Metapackage for core of rosserial."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rosserial-msgs rosserial-client rosserial-python"

RDEPENDS_${PN} = "rosserial-msgs rosserial-client rosserial-python"

SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/melodic/rosserial/0.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9e39f1f4285fcbc24ac1ac423db10f46"
SRC_URI[sha256sum] = "76cb860f1a6ba8a8bf9f13a2a878e91bc6cd33578e2bfadc0769449c6e9dc379"

S = "${WORKDIR}/rosserial-release-release-melodic-rosserial-0.8.0-0"

inherit catkin
