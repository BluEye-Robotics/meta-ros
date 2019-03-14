DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "robot viz angles common-tutorials geometry-tutorials ros-tutorials roslint urdf-tutorial visualization-tutorials"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/desktop/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "84f7eec609a66e319e063c2dce9240b7"
SRC_URI[sha256sum] = "4d24671184136e854522257de40f9ce4b618b16ffeaa478f9a25c34d95cd8bc5"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-desktop-1.4.1-0"

inherit catkin
