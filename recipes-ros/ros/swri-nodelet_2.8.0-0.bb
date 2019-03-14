DESCRIPTION = "This package provides a simple script to write simple launch files that can easily switch between running nodelets together or as standalone nodes."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "nodelet roscpp std-msgs"

RDEPENDS_${PN} = "rosbash"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/melodic/swri_nodelet/2.8.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7da0937af807bb74c2cae3d7f0e77772"
SRC_URI[sha256sum] = "028628e0bc364e9be5f608663cf49c988db0599bad0a534b9f1d4f707749a5a0"

ROS_SPN = "marti_common"
S = "${WORKDIR}/marti_common-release-release-melodic-swri_nodelet-2.8.0-0"

inherit catkin
