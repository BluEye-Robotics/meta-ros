DESCRIPTION = "The catkinized verseion of openslam_gmapping package (https://github. com/OpenSLAM-org/openslam_gmapping/tree/79ef0b0e6d9a12d6390ae64c4c00d37d776abefb)"
AUTHOR = "Cyrill Stachniss"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/openslam_gmapping-release/archive/release/melodic/openslam_gmapping/0.2.1-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9a0c000db11bf13e630a6d7bfff98ce9"
SRC_URI[sha256sum] = "9b61107d88d219e52ecb210abcb44d5248c760182c4c6bafd39beab1f5c78f5f"

S = "${WORKDIR}/openslam_gmapping-release-release-melodic-openslam_gmapping-0.2.1-1"

inherit catkin
