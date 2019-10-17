DESCRIPTION = "Pythonic implementation of behaviour trees."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-setuptools"

RDEPENDS_${PN} = "python3-enum34 python3-pydot"

SRC_URI = "https://github.com/stonier/py_trees-release/archive/release/melodic/py_trees/0.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "591a512c55a301a91a69ec7d019c6b0e"
SRC_URI[sha256sum] = "f0749de4867ee89d353aa9ba22338ec73044a05e186ee0d611caa917fc708c4d"

S = "${WORKDIR}/py_trees-release-release-melodic-py_trees-0.6.8-0"

inherit catkin
