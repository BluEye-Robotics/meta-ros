DESCRIPTION = "Geographic information metapackage. Not needed for wet packages, use only to resolve dry stack dependencies."
AUTHOR = "Jack O'Quin"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geodesy geographic-msgs"

RDEPENDS_${PN} = "geodesy geographic-msgs"

SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/melodic/geographic_info/0.5.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "64868b354a51ce9a35aca3b693014d93"
SRC_URI[sha256sum] = "fa023c42d3d879c61e6052534eb94de0ab79635946e10f0039f7daeb80f92bf1"

S = "${WORKDIR}/geographic_info-release-release-melodic-geographic_info-0.5.3-0"

inherit catkin
