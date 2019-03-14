DESCRIPTION = "More efficient version of tf/tf_remap able to handle TFs at kHz with tens of subscribers."
AUTHOR = "Martin Pecka"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "xmlrpcpp roscpp tf2-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/peci1/tf_remapper_cpp-release/archive/release/melodic/tf_remapper_cpp/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "616d6c583bc2e89c634e3f4e8ace0f13"
SRC_URI[sha256sum] = "e212a7354d6e6f6eb42f9f8a90551b26cc4ffd427324bfe6f82ccbcd4603f77a"

S = "${WORKDIR}/tf_remapper_cpp-release-release-melodic-tf_remapper_cpp-1.1.1-0"

inherit catkin
