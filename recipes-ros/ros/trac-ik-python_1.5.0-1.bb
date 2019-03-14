DESCRIPTION = "The trac_ik_python package contains a python wrapper using SWIG for trac_ik_lib"
AUTHOR = "Sam Pfeiffer"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy swig trac-ik-lib tf-conversions rospy swig trac-ik-lib tf-conversions tf"

RDEPENDS_${PN} = "rospy swig trac-ik-lib tf-conversions tf"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_python/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "49b292617aa2502f01353268c2fcb498"
SRC_URI[sha256sum] = "d61541a1eb22c8c6af749e058557fdbd0259fe89d4045230871a54b60666a5e1"

ROS_SPN = "trac_ik"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_python-1.5.0-1"

inherit catkin
