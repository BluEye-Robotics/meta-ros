DESCRIPTION = "laser_filters_jsk_patch"
AUTHOR = "k-okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "laser-geometry git cmake-modules mk laser-filters filters laser-filters filters"

RDEPENDS_${PN} = "laser-filters filters"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/laser_filters_jsk_patch/2.1.13-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ded46e06a9b97f8784aa65b21ff37a8"
SRC_URI[sha256sum] = "a6f1fb80defd53f329b29127878be0751e2eae4dd118671bc7166237b3f1d6e7"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-laser_filters_jsk_patch-2.1.13-1"

inherit catkin
