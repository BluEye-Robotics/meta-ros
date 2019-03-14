DESCRIPTION = "Python bindings for EXOTica"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "exotica-core pybind11-catkin moveit-msgs geometry-msgs shape-msgs python-matplotlib python-pyassimp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_python/5.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "82fe830e460e4a65d6e87b2a2056990b"
SRC_URI[sha256sum] = "e99dd7fd355c172861401fd6634dbda4e64f18fc28b4187504a8b83dbd2ae72e"

ROS_SPN = "exotica"
S = "${WORKDIR}/exotica-release-release-melodic-exotica_python-5.0.0-0"

inherit catkin
