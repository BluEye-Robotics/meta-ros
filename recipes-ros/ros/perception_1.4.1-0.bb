DESCRIPTION = "A metapackage to aggregate several packages."
AUTHOR = "Dirk Thomas"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "ros-base image-common image-pipeline image-transport-plugins laser-pipeline perception-pcl vision-opencv"

SRC_URI = "https://github.com/ros-gbp/metapackages-release/archive/release/melodic/perception/1.4.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c8f69fc9a4c184e62a241bd6d232a720"
SRC_URI[sha256sum] = "f6024982eaa029dafbe20bd1e533f46766f9731a485a837e4a450331f5594126"

ROS_SPN = "metapackages"
S = "${WORKDIR}/metapackages-release-release-melodic-perception-1.4.1-0"

inherit catkin
