DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "Kavraki Lab"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake boost libeigen pkgconfig boost libeigen"

RDEPENDS_${PN} = "boost libeigen"

SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/melodic/ompl/1.4.2-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a4488e2dc6ac10daf8109d31548aba8e"
SRC_URI[sha256sum] = "cdcd1f9c8f7d876221b6a1867cfb0ec99a3607a7c5118942fd430df007d8de70"

S = "${WORKDIR}/ompl-release-release-melodic-ompl-1.4.2-2"

inherit catkin
