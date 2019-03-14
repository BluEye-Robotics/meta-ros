DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "Kavraki Lab"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake boost libeigen pkgconfig boost libeigen"

RDEPENDS_${PN} = "boost libeigen"

SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/melodic/ompl/1.4.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1c9fad89415a5004f76ce911005d5ad7"
SRC_URI[sha256sum] = "35d69fbf80c64944c92a69d468823e68bcd7d776750720c7f50c3af09feb1b93"

S = "${WORKDIR}/ompl-release-release-melodic-ompl-1.4.2-0"

inherit catkin
