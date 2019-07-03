DESCRIPTION = "Utilities and tools developed for rocon, but usable beyond the boundaries of rocon."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rocon-master-info rocon-console rocon-ebnf rocon-interactions rocon-launch rocon-python-comms rocon-python-redis rocon-python-utils rocon-python-wifi rocon-semantic-version rocon-uri"

RDEPENDS_${PN} = "rocon-master-info rocon-console rocon-ebnf rocon-interactions rocon-launch rocon-python-comms rocon-python-redis rocon-python-utils rocon-python-wifi rocon-semantic-version rocon-uri"

SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/melodic/rocon_tools/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "db93653d10929791c2a89a79e81e48d1"
SRC_URI[sha256sum] = "688fc316688135e08e1fd33312879d6059122f1fd9122c4ded28dd4177b59cce"

S = "${WORKDIR}/rocon_tools-release-release-melodic-rocon_tools-0.3.2-0"

inherit catkin
