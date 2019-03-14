DESCRIPTION = "Common-Lisp ROS message and service generators."
AUTHOR = "Bhaskara Marti"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "genmsg genmsg"

RDEPENDS_${PN} = "genmsg"

SRC_URI = "https://github.com/ros-gbp/genlisp-release/archive/release/melodic/genlisp/0.4.16-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "e5610339a72360fa6582370ecd156b6e"
SRC_URI[sha256sum] = "0da61ebbb633656062ce030fc94b5931bf3cdf3b5cf896116895608a739a520a"

S = "${WORKDIR}/genlisp-release-release-melodic-genlisp-0.4.16-0"

inherit catkin
