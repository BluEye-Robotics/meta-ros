SRC_URI = "https://github.com/ros-industrial/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "82b7b030e722e3925d6e396c2acdcd1d"
SRC_URI[sha256sum] = "ee635aea8b6cd7b9412fdb04536e90913079fb9848b2fdbcef4e37d7e3b1092f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "industrial_core"
