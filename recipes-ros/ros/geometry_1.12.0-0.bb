DESCRIPTION = "A metapackage for geometry library suite."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles eigen-conversions kdl-conversions tf tf-conversions"

RDEPENDS_${PN} = "angles eigen-conversions kdl-conversions tf tf-conversions"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/geometry/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8eb49639da443b3e535432eebaafe9ea"
SRC_URI[sha256sum] = "6e5e79d8157d16ce6c27bc7b8f1e8411f0fea3a01698f69962746ec4af80e44d"

S = "${WORKDIR}/geometry-release-release-melodic-geometry-1.12.0-0"

inherit catkin
