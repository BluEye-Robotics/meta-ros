DESCRIPTION = "		fmt is an open-source formatting library for C++. 		It can be used as a safe and fast alternative to (s)printf and IOStreams."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "roscpp rosconsole"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosfmt-release/archive/release/melodic/rosfmt/6.1.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "41d4f01a334eb428a8f76ef4d9e3eb54"
SRC_URI[sha256sum] = "8863afa48a520a2e262575c5a650c6258e5da038400063889cc44ef42bfcce3d"

S = "${WORKDIR}/rosfmt-release-release-melodic-rosfmt-6.1.0-1"

inherit catkin
