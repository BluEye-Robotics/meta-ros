DESCRIPTION = "Locally patched version of the python redis client (https://github. com/andymccurdy/redis-py)."
AUTHOR = "Andy McCurdy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "python3-catkin-pkg"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_python_redis/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "42e0054528c15d6d7750641b4458915c"
SRC_URI[sha256sum] = "1a4191ef365c4c05d0bc6cc96bf5754a4f6a0b787dedb55e80676cbc03aa71ac"

ROS_SPN = "rocon_tools"
S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_python_redis-0.3.2-0"

inherit catkin
