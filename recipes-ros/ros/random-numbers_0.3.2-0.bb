DESCRIPTION = "This library contains wrappers for generating floating point values, integers, quaternions using boost libraries. The constructor of the wrapper is guaranteed to be thread safe and initialize its random number generator to a random seed. Seeds are obtained using a separate and different random number generator."
AUTHOR = "Ioan Sucan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost boost"

RDEPENDS_${PN} = "boost"

SRC_URI = "https://github.com/ros-gbp/random_numbers-release/archive/release/melodic/random_numbers/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "400ee29d43591712831b831e1ef8a9f5"
SRC_URI[sha256sum] = "989cf481e8bd4c7b44278d73a549554fd874479c1f28e8d26f77fa905a43e409"

S = "${WORKDIR}/random_numbers-release-release-melodic-random_numbers-0.3.2-0"

inherit catkin
