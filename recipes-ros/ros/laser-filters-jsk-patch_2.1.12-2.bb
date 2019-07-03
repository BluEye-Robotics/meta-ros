DESCRIPTION = "laser_filters_jsk_patch"
AUTHOR = "k-okada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "laser-geometry git cmake-modules mk laser-filters filters laser-filters filters"

RDEPENDS_${PN} = "laser-filters filters"

SRC_URI = "https://github.com/tork-a/jsk_3rdparty-release/archive/release/melodic/laser_filters_jsk_patch/2.1.12-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "56d4fc1a870d788411f1fed2704f7d15"
SRC_URI[sha256sum] = "96345754944f8c09d98650e946fa083a1785731e58f129a6387b14c214574d84"

ROS_SPN = "jsk_3rdparty"
S = "${WORKDIR}/jsk_3rdparty-release-release-melodic-laser_filters_jsk_patch-2.1.12-2"

inherit catkin
