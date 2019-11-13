DESCRIPTION = "This is SDHLibrary-CPP, the C++ library to access an SDH (SCHUNK Dexterous Hand)"
AUTHOR = "Dirk Osswald"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/SDHLibrary-CPP-release/archive/release/melodic/sdhlibrary_cpp/0.2.10-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4e108e5665f79706b552cc8fd34c6922"
SRC_URI[sha256sum] = "cdc88eafafbe1def8674349fac30f504bd9d354416ec2a2daa58e47d3d138db3"

S = "${WORKDIR}/SDHLibrary-CPP-release-release-melodic-sdhlibrary_cpp-0.2.10-1"

inherit catkin
