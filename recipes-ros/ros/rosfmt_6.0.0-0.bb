DESCRIPTION = "		fmt is an open-source formatting library for C++. 		It can be used as a safe and fast alternative to (s)printf and IOStreams."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=75730354549103aaba72b66caf53717b"

DEPENDS = "roscpp rosconsole"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/xqms/rosfmt-release/archive/release/melodic/rosfmt/6.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9bca04c255f31b4a7513c4ffd0a16d74"
SRC_URI[sha256sum] = "e1ad333968f25d127063d05379f33345f56fa5fa9d195f24c69d9139b9013770"

S = "${WORKDIR}/rosfmt-release-release-melodic-rosfmt-6.0.0-0"

inherit catkin
