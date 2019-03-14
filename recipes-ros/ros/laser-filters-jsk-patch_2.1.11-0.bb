DESCRIPTION = "laser_filters_jsk_patch"
AUTHOR = "k-okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "laser-geometry git cmake-modules mk laser-filters filters laser-filters filters"

RDEPENDS_${PN} = "laser-filters filters"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/laser_filters_jsk_patch/2.1.11-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "41e3be5d41b070a50071648dc148c567"
SRC_URI[sha256sum] = "527127469522f807829b1ea468b5e060556a1b55e1023deff91c921171746dec"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-laser_filters_jsk_patch-2.1.11-0"

inherit catkin
