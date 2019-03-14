DESCRIPTION = "A bond allows two processes, A and B, to know when the other has terminated, either cleanly or by crashing. The bond remains connected until it is either broken explicitly or until a heartbeat times out."
AUTHOR = "Stu Glaser"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "bond bondcpp bondpy smclib"

SRC_URI = "https://github.com/ros-gbp/bond_core-release/archive/release/melodic/bond_core/1.8.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "de437930f0c46787bf12a777a23713ca"
SRC_URI[sha256sum] = "c295706b5def3265868e81d63c1ee31e622e6f286cfde31a8a6c8ce43f9a07b5"

S = "${WORKDIR}/bond_core-release-release-melodic-bond_core-1.8.3-0"

inherit catkin
