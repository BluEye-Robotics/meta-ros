DESCRIPTION = "Python implementation of the URDF parser."
AUTHOR = "Thomas Moulard"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python"

RDEPENDS_${PN} = "python-lxml python-pyyaml"

SRC_URI = "https://github.com/ros-gbp/urdfdom_py-release/archive/release/melodic/urdfdom_py/0.4.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0836179118272260e2715455133fda4b"
SRC_URI[sha256sum] = "9d0663d9bde7a548ba4df458423922d7d1e326a786e50cc33846f0835c4843f6"

S = "${WORKDIR}/urdfdom_py-release-release-melodic-urdfdom_py-0.4.0-0"

inherit catkin
