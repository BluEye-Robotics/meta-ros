DESCRIPTION = "Makes it possible to run the ros_ethercat_loop without using sudo. Forked from pr2-grant"
AUTHOR = "Ugo Cupcic"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "libcap-dev roscpp"

RDEPENDS_${PN} = "libcap-dev roscpp"

SRC_URI = "https://github.com/shadow-robot/ethercat_grant-release/archive/release/melodic/ethercat_grant/0.2.5-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2ce34ddb094ad09cf6e0f2dce28568d3"
SRC_URI[sha256sum] = "3b5baa1b6b84b2538af53dcc410d980579cbfc932f002dcf3cc25071bb452a52"

S = "${WORKDIR}/ethercat_grant-release-release-melodic-ethercat_grant-0.2.5-0"

inherit catkin
