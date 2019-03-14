DESCRIPTION = "ROS wrapper for the sparse bundle adjustment (sba) library (needed for slam_karto)"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libeigen liblapack-dev libblas-dev suitesparse"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/sparse_bundle_adjustment-release/archive/release/melodic/sparse_bundle_adjustment/0.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7b99d5be6c70d16d0023d9df3264a4dc"
SRC_URI[sha256sum] = "ab87c65d8f8d392258c9d733edf76c417488f78b564a7ce7000bd67ed5bd26fd"

S = "${WORKDIR}/sparse_bundle_adjustment-release-release-melodic-sparse_bundle_adjustment-0.4.2-0"

inherit catkin
