DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "desktop perception simulators urdf-sim-tutorial"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/desktop_full/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fc1c5f6f019699725540309899b942b3"
SRC_URI[sha256sum] = "236064fd3c4cccc5327f1ac4c951c70762a1f6c88e9faa521251f78e26ea987b"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-desktop_full-1.4.1-0"

inherit catkin
